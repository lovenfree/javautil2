package com.java.dx;




import java.io.ByteArrayInputStream;

import java.io.FileOutputStream;

import java.io.ObjectInputStream;

import java.util.Map;



import org.eclipse.jetty.client.HttpClient;

import org.eclipse.jetty.client.api.ContentResponse;

import org.eclipse.jetty.http.HttpMethod;


//(GET, 바이너리 파일 전송 요청)
public class BinaryFile {

  public static void main(String[] args) throws Exception {

    HttpClient httpClient = new HttpClient();

    httpClient.start();

    ContentResponse contentRes =

        httpClient.newRequest("http://127.0.0.1:8080/requestFile").method(HttpMethod.GET).send();

    byte [] myByteArray = contentRes.getContent();



    try (FileOutputStream fos = new FileOutputStream("C:\\temp\\test.jpg")) {

      fos.write(myByteArray);

    }

    httpClient.stop();

  }

}