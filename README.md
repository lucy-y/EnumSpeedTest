- 목적 : Enum을 For, Arrays.stream, Stream.of, HashMap 방식으로
값(데이터)를 가져올 때 속도테스트 확인

- 실행조건 : 1000000번 호출
- 실행결과
```
소년
NO RESULT
소녀
소녀
=== For ===
took 29 ms
=== Arrays.stream ===
took 112 ms
=== Stream.of ===
took 141 ms
=== HashMap ===
took 21 ms
```