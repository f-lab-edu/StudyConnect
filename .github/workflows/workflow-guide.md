> cicd 구축 과정을 정리한 게시글

## gradle.yml

> 빌드 테스트 후 배포 과정을 진행하는 워크 플로우 입니다.

- 소스 코드 체크아웃:
    - actions/checkout@v3를 사용하여 레포지토리의 소스 코드를 체크아웃
- JDK 17 설정:
    - actions/setup-java@v3를 사용하여 Temurin 배포판의 JDK 17을 설치하고 설정
- Grad0le 의존성 캐시:
    - actions/cache@v3를 사용하여 Gradle 의존성을 캐시. 이렇게 하면 빌드 시간이 단축된다.
- Gradle 빌드:
    - ./gradlew build 명령을 사용하여 프로젝트를 빌드.
- 빌드 결과물 업로드:
    - actions/upload-artifact@v2를 사용하여 빌드 결과물을 GitHub Actions 아티팩트로 업로드.
- 테스트 및 HTML 리포트 생성:
    - ./gradlew test --continue --no-daemon --console=plain --info testReport 명령을 사용하여
      테스트를 실행하고 HTML 리포트를 생성
- 테스트 리포트 업로드:
    - actions/upload-artifact@v2를 사용하여 생성된 테스트 리포트를 아티팩트로 업로드
    - 이 작업은 워크플로우가 실패하더라도 항상 실행된다.

----

## code-quality-check.yml

> 코드의 커버리지와 컨벤션을 체크 하는 워크 플로우입니다.