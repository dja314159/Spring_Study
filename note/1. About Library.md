# 라이브러리 살펴보기

- 여러 라이브러리가 많은 이유
    
    ⇒ Gradle이나 Maven은 빌드할때 다 땡겨온다.
    
- Sysout.println 잘 안하는 이유
    
    ⇒ 현업에서는 심각한 오류들을 로깅해야하니 로그형태로 많이 남긴다.
    
    1. slf4j : Simple Logging Facade for Java, 로그 라이브러리
    2. log back : slf4j의 구현체
- 핵심 라이브러리
    - spring-boot-starter-web
        - tomcat, 스프링 웹 MVC 들어있음
    - spring-boot-starter-thymeleaf 엔진
    - spring-boot-starter(공통) : 스프링부트+스프링코어+로깅
        - 위에서 말한 두 로깅방법으로 한다.
- 여러 테스트 라이브러리가 있다.
