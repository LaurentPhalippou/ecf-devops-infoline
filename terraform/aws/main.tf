provider "aws" {
  region = "eu-west-3"
}

resource "aws_s3_bucket" "ecf_bucket" {
  bucket = "ecf-devops-infoline-laurent-phalippou"
}
