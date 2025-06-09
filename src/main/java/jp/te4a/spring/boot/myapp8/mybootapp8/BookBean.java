package jp.te4a.spring.boot.myapp8.mybootapp8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean{
    public Integer id;
    public String title;
    public String writer;
    public String publisher;
    public Integer price;
}