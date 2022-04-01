## 1. getting started with spark.java

- [x] create gradle project
- [x] add spark.java dependency
- [x] practice get method - request and response data

## 2. html and post

- [x] create html file and UI
- [x] practice post method - deliver data to server

## 3. template engine

- [x] what is template engine?
    - html 파일을 동적으로 만들 때 사용
    - render 메서드를 통해 model 과 template 이 될 html 파일을 응답
        - model 은 `Map<String, Object>` 형식으로 구성되어 있음
        - model.put("동적 html 파일에 사용 될 변수명", req.queryParams("정적 html 파일로 부터 받은 변수명"))
        - 동적 html 파일에 사용 될 변수는 `{{변수명}}` 형식으로 동적 html 파일에 추가되어야 함
    - 동적 html 파일은 `templates` 디렉터리에 존재해야 함
- [x] add handlebars template engine dependency
- [x] deliver data to handlebars template engine

## 4. java bean and handlebars for-loop

- [x] what is java bean
    - 기본 생성자가 있고, iv 를 가지고 있으며, iv 에 대한 getter, setter 가 있는 클래스
- [x] save user data in User.java
    - `{{user.name}} == user.getName()`
- [x] implement user list page
    - user 리스트 users 에서 template engine 이 알아서 for-loop 를 돌림
