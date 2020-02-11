# azure-ad-b2c-microservice

A simple [Spring Boot](https://spring.io/projects/spring-boot) micro-service used to integrate with an
[Azure AD B2C](https://azure.microsoft.com/en-us/services/active-directory-b2c/) [enabled UI](https://github.com/dixonwhitmire/azure-ad-b2c-ui).

The current release, 1.0, is a baseline release which permits unauthenticated access to services. Authentication will
be required in the 2.0 release.

## Project setup

Complete the setup steps for:
- [Azure AD B2C](https://github.com/microsoft/azure-spring-boot/tree/master/azure-spring-boot-samples/azure-active-directory-b2c-oidc-spring-boot-sample)
- [Sample UI](https://github.com/dixonwhitmire/azure-ad-b2c-ui)

### run the application
```
./gradlew bootRun
```

### build and run unit tests
```
./gradlew clean build
```