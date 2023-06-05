# nowon5/ 인터파크 쇼핑몰 구현 프로젝트

# to_do


- nowon_member 테이블과 my_role 테이블 연결: role 부여


- 비밀번호 암호화 


- 로그인시 암호화된 비밀번호와 입력된 비밀번호 비교


-  controller가 아닌 WebSecurityConfig로 로그인 하기 @Bean @Service 둘 중 하나만 사용하기


- 로그인 / 로그아웃 구현: 수정, 삭제 버튼 권한에 따라 노출

  - 글쓰기: 회원, 관리자(공지사항), 글쓰기 시 자동으로 작성자 입력

  - 수정: 회원(작성자)

  - 삭제: 회원(작성자), 관리자

  - 경로가 같으면 front에서 if문 처리(role에 따라서)

  - 조회: 모든 이용자


- 상품 리스트 페이지 이미지 출력: AWS 버킷 이용하여 출력


- 등록 페이지 배경 색상 변경


- 상품 리스트 페이지 디자인
