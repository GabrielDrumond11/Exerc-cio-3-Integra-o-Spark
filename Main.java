package your.package.name;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        

        staticFiles.location("/public");

        get("/cadastro", (req, res) -> {
            return renderHtml("product_form.html");
        });

        post("/cadastrar-produto", (req, res) -> {
            String nome = req.queryParams("nome");
            String descricao = req.queryParams("descricao");
            double preco = Double.parseDouble(req.queryParams("preco"));

          

            return "Produto cadastrado com sucesso!";
        });
    }
}
