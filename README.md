# curso_aws_cdk

## What does it do?
Create products, persist in the database and send events to the topic

## Responsibility
Persist in database product creation or change.

## Development

#### Pre-requisites:
* IntelliJ
* Java 17
* Gradlew
* If you want to use [Docker](https://docs.docker.com/), install version 1.12 or greater: https://docs.docker.com/get-docker/

#### Service architecture
![alt text](curso_aws_cdk_archicture.png "macro")

#### Running Local

```bash
#### mariadb database
$ `docker-compose up`

#### localstack services sns and sqs
$ `docker run --rm -p 4566:4566 -p 4571:4571 localstack/localstack -e "SERVICES=sns,sqs,dynamodb"`

#### Environments your IDLE
$ `spring.profiles.active=local`
```
