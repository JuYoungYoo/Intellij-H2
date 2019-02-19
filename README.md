# Intellij-H2
Intellij + SpringBoot + H2 DB 

- 로컬에서 개발환경 세팅하며 H2 DB를 많이 사용하게 되었다. Browser에서 h2-console 확인하는 번거로움과 기능상의 한계점으로 개발하는 시간보다 더 많은 시간을 투자하고 있었다.
우연히 한 블로그를 통해 해결방법을 알게 되었다.

- 참고 : https://jojoldu.tistory.com/234?category=678716

___

이 글에서 에러 발생한 부분이 있는데, Spring Boot의 버전이 높아져서 Connection error가 발생하였다.

##### Spring Boot 2.1.3 기준 Connection error 해결방법
```
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	compileOnly 'org.projectlombok:lombok'

  // 추가
	compile('org.springframework.boot:spring-boot-starter-web')
	// https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jdbc
	compile group: 'org.apache.tomcat', name: 'tomcat-jdbc', version: '7.0.19'
  // /추가

//	runtimeOnly 'com.h2database:h2'		// 기존 설정 : runtime인 경우 코드 작성시 라이브러리가 호출되지 않음
	compile 'com.h2database:h2'	// compile로 변경 : JVM 메모리에 올리게 되는데 외부에서 접근이 불가능하기 때문, 이를 회피하기위해 h2 library에서 제공하는 Tcpserver 사용
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

```
