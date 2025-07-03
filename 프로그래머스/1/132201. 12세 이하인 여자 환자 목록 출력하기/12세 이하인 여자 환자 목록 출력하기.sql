-- 코드를 입력하세요
SELECt PT_NAME, PT_NO, GEND_CD, AGE, ifnull(TLNO,'NONE') from PATIENT where AGE <= 12 and GEND_CD = 'W' order by age DESC, PT_NAME;