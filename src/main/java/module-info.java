module com.example.javas {
  requires spring.boot.autoconfigure;
  requires spring.boot;
  requires java.sql;
  requires spring.boot.starter.webflux;
  requires spring.web;

  opens com.example.javas10;
}
