# Checkpoint 1 (Ping)

Aplicação Java com container para avaliação do Checkpoint1

## Pré-requisitos

- Java 17+
- Docker 
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/MateusSoaRod/fiap-checkpoint1.git
```

## Execução


#### Docker

* Criar imagem

```
docker build -t fiap-checkpoint1 .
```

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> mateussoarod/fiap-checkpoint1
```

## Container Registry


#### Docker Hub

* Login

```
docker login -u <username>
```

* Criar imagem pronta para upload (método 1 - criando nova imagem)


```
docker build -t <username>/fiap-checkpoint1 .
```


* Criar imagem pronta para upload (método 2 - renomeando imagem existente)


```
docker tag ping mateussoarod/fiap-checkpoint1
```


* Upload de imagem para o Docker Hub


```
docker push mateussoarod/fiap-checkpoint1 
```



#### Navegação

- Base

http://localhost:8080

- Endpoint que retorna string "Pong"

http://localhost:8080/ping 


## Features (Funcionalidades)

- Múltiplos profiles

## Contatos

- Desenvolvedor 1 - desenvolvedor1@email.com
- Desenvolvedor 2 - desenvolvedor2@email.com

## Referencias

 - [UOL](https://www.uol.com.br/)
 - [Gov br](https://www.gov.br/)