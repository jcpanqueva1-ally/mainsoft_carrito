package com.mainsoft.carrito.auth;

public class JwtConfig {

    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" +
            "MIIEogIBAAKCAQEApnP7Lyi5rkcrPh9pq8ErDTWxQKLas0W9gg2pLCdjZQrCscs1\r\n" +
            "YfrXRAAEsNqwzd64lIbk0QSPUW7RRWT3l4cB/bxeYv3pDt9gPQQ7dqSGAezJ99Dr\r\n" +
            "8oE7gAKlpxp6yCAn1guLNxqqNhWqlAE5JXGMSoUKzeTQhUe7GpGbfHEx6cCZVWt0\r\n" +
            "VV5EtCQvOK1jiHokQ1JjFQ3czuhy6TYwhbO3hn21wmkdGOZMZEATwULA/LSAXq3O\r\n" +
            "b5C1+wNdxJrRBvivHa6pHJzRehpPfuxJUmx8PNA6JxsB20MOXJDBqkKYYwZ6iNH6\r\n" +
            "VSjoIotUlUFLky+hayCipBbJbp67alyjqvWvhwIDAQABAoIBAFBJYx/1GdLZGx+E\r\n" +
            "0Vh5/QULH+sYYjrUabsgUbgta4DiNtTBOod/EXQIOjr/0QYL5qYlhprXAzX5KNG7\r\n" +
            "CL267hfwUuqWpGJ7FhV4RCJO6yBkkWqKCDTZZtSw8ivu1shO0kgpG0ZCA1XBD50C\r\n" +
            "FglcgpmzIGn9cyLGXZZMI15bzwJ7D5ZRWadXsSarHv6p0jHxkAQ5YucquBh5LRVF\r\n" +
            "I2+j6wjOfMtoHjMC7+vSs2/375UY4IB5IQj1trZDOP86ftE9E7/f0lsAwoGxvnMf\r\n" +
            "ZdWqq9oMXeUgLLK528NuF/bvOHmz7NfdvqS67xc523XNxuh5vUsLV7U/gspqYFtS\r\n" +
            "5lFBQxECgYEAz7n8SMLbA+p+0qjmVbMulMiUmm1OP146V8veXVK6TQF/U9wUdE2M\r\n" +
            "Mv/btj+PWx91s4ZTt2uUcR7HBIR13pH8O0mhC705LmoY7ga4GzxgU9Fmi/P94yxO\r\n" +
            "nXR0AtyBH5ZgD1YN1kOOfjV6KNQlv3LFEYfwGDyLtM/8j84sTGoHA6kCgYEAzSKQ\r\n" +
            "wTOi+H9+jnle4oZL+UulRuGbWytEIAjs0pXeoQpc3sdUnz7HK2vWa/Ln64M8RtZY\r\n" +
            "s3HHMcW/M4QowMReM2fUOi8rjRRkiXX0JV0TKrzuFRpGdr8p1pakoD+BSdIpcGhE\r\n" +
            "ke2ukGy9UGT6TjpoMv3vApB+z6M/jJ+zlD3mF68CgYAJxZsLpTb+YSqkKFPlli9L\r\n" +
            "yn/LH/c9XeZquOl2BG1FMBvYSxMfQYKl54ljcmwBAmLcFiacC1CJXcRI/x44YS+3\r\n" +
            "bkhIMBefilgv4lsI1PdHGiOz07+Oz0fHenH2rH7aiI1uS0MNYFI0t7lOcGRyNCj3\r\n" +
            "ISj3SunbkKk17qIA2kAIOQKBgCV+uuzFjnVTgIN0Rdar63kezY/+LtJkPyiH2RnI\r\n" +
            "0Q+ogD8sOhh9dhRGusOye5e9vifIiCAMnPdJCODWuEg73GgTA2S7OH+qCZJioASw\r\n" +
            "VY+LRw1OZzDPUktp759m3C/tHSvxsw7lXfICHjxyqJnh7Sfc6HIUjUlQso32pvFi\r\n" +
            "uwr7AoGAfhWmW0efg5+vTGX+ePDBZppzVycMU4gX9FH4URNm9lGLUgMm7y0uPRP4\r\n" +
            "kZRlZ0nm+OfQz8A21MXwtCnhnMbZoBi6vzUHsbE5SY9wjqZGOhLgHw9nNVMjphPn\r\n" +
            "CFAf9Qhx2pWklaYHCXhDg1uVagP1bx+u8VYvAvD2kzHQPZyuFvI=\r\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApnP7Lyi5rkcrPh9pq8Er\r\n" +
            "DTWxQKLas0W9gg2pLCdjZQrCscs1YfrXRAAEsNqwzd64lIbk0QSPUW7RRWT3l4cB\r\n" +
            "/bxeYv3pDt9gPQQ7dqSGAezJ99Dr8oE7gAKlpxp6yCAn1guLNxqqNhWqlAE5JXGM\r\n" +
            "SoUKzeTQhUe7GpGbfHEx6cCZVWt0VV5EtCQvOK1jiHokQ1JjFQ3czuhy6TYwhbO3\r\n" +
            "hn21wmkdGOZMZEATwULA/LSAXq3Ob5C1+wNdxJrRBvivHa6pHJzRehpPfuxJUmx8\r\n" +
            "PNA6JxsB20MOXJDBqkKYYwZ6iNH6VSjoIotUlUFLky+hayCipBbJbp67alyjqvWv\r\n" +
            "hwIDAQAB\r\n" +
            "-----END PUBLIC KEY-----";
}
