package Task_1;

import java.io.IOException;

import org.testng.Assert;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class httpClient {






    public static void main(String[] args) throws IOException {
        System.out.println("Написати тест, який за допомогою http client робить запит до будь-якого ресурсу і перевіряє чи прийшов відповідний статус в response-і, чи тип повернення контенту вірний, розпарсує дані і перевіряє чи в даних є дані, які ви очікуєте.");

        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Response response = okHttpClient.newCall(new Request.Builder().url("http://google.com").build()).execute();
        Assert.assertEquals(response.code(), 200, "Status code was not 200");
        Assert.assertTrue(response.header("Content-Type").contains("text/html"),
                "text/html content type was not detected");
        String responseBody = response.body().string();
        System.out.println(responseBody);
        Assert.assertTrue(responseBody.contains("hplogo"), " element was not found");
        System.out.println("\n"+response);
    }
    }

















