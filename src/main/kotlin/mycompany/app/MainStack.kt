package mycompany.app

import com.hashicorp.cdktf.TerraformResourceLifecycle
import com.hashicorp.cdktf.TerraformStack
import com.hashicorp.cdktf.providers.docker.Container
import com.hashicorp.cdktf.providers.docker.ContainerPorts
import com.hashicorp.cdktf.providers.docker.DockerProvider
import com.hashicorp.cdktf.providers.docker.Image
import com.hashicorp.cdktf.providers.kubernetes.Deployment
import com.hashicorp.cdktf.providers.kubernetes.DeploymentMetadata
import com.hashicorp.cdktf.providers.kubernetes.DeploymentSpec
import com.hashicorp.cdktf.providers.kubernetes.DeploymentSpecSelector
import com.hashicorp.cdktf.providers.kubernetes.DeploymentSpecTemplate
import com.hashicorp.cdktf.providers.kubernetes.DeploymentSpecTemplateMetadata
import com.hashicorp.cdktf.providers.kubernetes.DeploymentSpecTemplateSpec
import com.hashicorp.cdktf.providers.kubernetes.DeploymentSpecTemplateSpecContainer
import com.hashicorp.cdktf.providers.kubernetes.KubernetesProvider
import software.constructs.Construct

class MainStack(scope: Construct?, id: String?, blah: String?) : TerraformStack(scope!!, id!!) {
    init {
        DockerProvider.Builder.create(this, "docker")
            .build()
        val image = Image.Builder.create(this, "nginxImage3")
            .name("nginx:1.23.1")
            .keepLocally(false)
            .build()

        Container.Builder.create(this, "nginxContainer")
            .image(image.name)
//            .image("sha256:f493a2ff29351b631327bde8d3c535f59252e27cd349f57fb80c0b6814b624e4")
            .name("tutorial")
            .ports(listOf(ContainerPorts.builder().internal(80).external(8001).build()))
            .lifecycle(TerraformResourceLifecycle.builder().ignoreChanges(listOf("image")).build())
            .build()

        KubernetesProvider.Builder.create(this, "kubernetes")
            .configPath("/Users/carolosfoscolos/.kube/config")
            .configContext("docker-desktop")
            .build()

        Deployment.Builder.create(this, "nginx")
            .metadata(DeploymentMetadata.Builder().name("nginx").labels(mapOf("app" to "nginx")).build())
            .spec(
                DeploymentSpec.Builder()
                    .template(
                        DeploymentSpecTemplate.Builder()
                            .metadata(DeploymentSpecTemplateMetadata.builder().labels(mapOf("app" to "nginx")).build())
                            .spec(
                                DeploymentSpecTemplateSpec
                                    .builder()
                                    .container(listOf(
                                        DeploymentSpecTemplateSpecContainer.builder().name("nginx").image("nginx:1.23.1").build()
                                    ))
                                    .build()
                            )
                            .build()

                    )
                    .selector(DeploymentSpecSelector.builder().matchLabels(mapOf("app" to "nginx")).build())
                    .build()
            ).build()


    }
}