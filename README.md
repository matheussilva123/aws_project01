# Run local

`docker-compose up`

`docker run --rm -p 4566:4566 -p 4571:4571 localstack/localstack -e "SERVICES=sns,sqs,dynamodb,s3"`

Your IDLE 
`spring.profiles.active=local`