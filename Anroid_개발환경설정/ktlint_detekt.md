# Ktlint
- lint : 코드를 분석하여, 프로그램 오류, 버그, 스타일 오류, 구조적 문제점을 확인하는 도구
  - 코딩 컨벤션에 따라 코드를 작성했는지 확인해주는 도구
  - ktlint : kotlin 개발 환경에서 사용되는 lint로, 공식 코틀린 코딩 컨벤션과 안드로이드 코틀린 스타일 가이드에 따라 만들어짐
  - Android lint : 폴더 선택 > 마우스 오른쪽 버튼 > Analyze > Inspect


# detekt
- 정적 프로그램 분석(static program analysis) : 프로그램을 실행하지 않고, 소프트웨어를 분석하는 것

- ktlint vs detekt
  - ktlint는 코딩 컨벤션을 중점적으로 보고, detekt는 코드의 전체적인 퀄리티를 높이기 위한 분석을 수행
    - 예를 들면, 메서드 길이가 너무 길다거나, 메서드의 depth가 너무 깊다거나 등의 분석을 수행함

- https://detekt.dev/
