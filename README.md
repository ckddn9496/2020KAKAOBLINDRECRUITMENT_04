# 2020KAKAOBLINDRECRUITMENT_04

## 2020 KAKAO BLIND RECRUITMENT 가사 단어 질의
> 아직 문제가 공개되지 않아 문제의 설명이 부족할 수 있습니다.

### 1. 문제설명

> 효율성 부분점수가 있는 문제

input으로 노래에 나오는 가사의 단어들 String[] words, 질의 키워드들 String[] queries가 들어온다. queries에는 Wildcard인 ? 문자가 들어가 있다. queries에대해 질의하였을 때 나오는 일치하는 단어의 갯수를 return하는 문제.

### 2. 풀이

Stirng의 startsWith, endsWith함수를 이용하여 쿼리에서 와일드 카드를 제거한 문자열과 word를 비교하여 단어갯수를 카운트하였다.

HashMap을 이용하여 같은 쿼리에 대한 결과는 words를 순회하지 않더라도 바로 얻을 수 있도록 하였다. 효율성 테스트에서 5개중 1개를 실패하였는데 어떻게 개선이 되어야 하는지 아직 잘 떠오르지 않는다.
