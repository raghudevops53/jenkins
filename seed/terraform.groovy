///
folder('Terraform-Releases') {
  displayName('Terraform-Releases')
  description('Terraform-Releases')
}

pipelineJob('Terraform-Releases/VPC') {
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps53/_git/terraform-vpc')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/main')
          }
        }
      }
      'scriptPath'('Jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('Terraform-Releases/FRONTEND') {
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps53/_git/terraform-frontend')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/main')
          }
        }
      }
      'scriptPath'('Jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('Terraform-Releases/ALB') {
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps53/_git/terraform-alb')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/main')
          }
        }
      }
      'scriptPath'('Jenkinsfile')
      'lightweight'(true)
    }
  }
}
