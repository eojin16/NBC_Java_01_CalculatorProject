NBC Java 01 — Calculator Project

간단한 콘솔 기반 계산기 애플리케이션

주요 기능

프로젝트는 커밋 이력상 Lv1 → Lv2 단계로 확장되었으며, 결과 이력 관리 및 삭제 기능이 추가되어 있습니다.  ￼
	•	Lv1: 기본 계산기
	•	사칙연산(+, -, *, /)을 지원합니다.
	•	표준 입력을 통해 피연산자와 연산자를 받아 결과를 출력합니다.
	•	Lv2: 기능 확장
	•	결과 이력(컬렉션) 저장 기능을 제공합니다.
	•	결과 삭제(removeResult) 기능을 제공합니다.
	•	반복 실행을 통해 여러 계산을 순차적으로 수행할 수 있습니다.

프로젝트 구조

NBC_Java_01_CalculatorProject/
├─ .idea/                      # IntelliJ IDEA 설정 파일
├─ src/                        # 자바 소스 코드
├─ .gitignore
└─ CalculatorProject.iml       # IntelliJ 모듈 파일

저장소 메타데이터와 파일 구성은 GitHub 페이지 기준입니다.  ￼

실행 환경
	•	JDK: 17 이상 권장입니다.
	•	IDE: IntelliJ IDEA(권장) 또는 Eclipse 등 자바 IDE입니다.
	•	OS: Windows / macOS / Linux 공통입니다.

빌드 및 실행 방법

IntelliJ IDEA에서 실행
	1.	File > Open으로 저장소 루트를 연 다음 CalculatorProject.iml을 선택하여 엽니다.
	2.	JDK를 17 이상으로 지정합니다.
	3.	src 내 main 메서드가 포함된 클래스를 실행합니다.
