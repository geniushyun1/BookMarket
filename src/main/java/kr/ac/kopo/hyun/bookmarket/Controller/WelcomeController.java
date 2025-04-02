package kr.ac.kopo.hyun.bookmarket.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
  @RequestMapping(value = "./home", method = RequestMethod.GET)
    public String welcomeMethod(){
      String welcomeHtml = "<!DOCTYPE html>\n" +
              "<html lang=\"en\">\n" +
              "<head>\n" +
              "    <meta charset=\"UTF-8\">\n" +
              "    <title>Welcome BookMarket</title>\n" +
              "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n" +
              "          crossorigin=\"anonymous\">\n" +
              "</head>\n" +
              "<main>\n" +
              "    <body class=\"container py-4\">\n" +
              "        <header class=\"pb-3 mb-4 border-bottom\">\n" +
              "            <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
              "                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"40\" height=\"32\" class=\"me-2\" viewBox=\"0 0 118 94\" role=\"img\"><title>Bootstrap</title><path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z\" fill=\"currentColor\"></path></svg>\n" +
              "                <span class=\"fs-4\">Book Market</span>\n" +
              "            </a>\n" +
              "        </header>\n" +
              "        <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
              "            <div class=\"container-fluid py-5\">\n" +
              "                <h1 class=\"display-5 fw-bold\">Custom jumbotron</h1>\n" +
              "                <p class=\"col-md-8 fs-4\">Using a series of utilities, you can create this jumbotron, just like the one in previous versions of Bootstrap. Check out the examples below for how you can remix and restyle it to your liking.</p>\n" +
              "                <button class=\"btn btn-primary btn-lg\" type=\"button\">Example button</button>\n" +
              "            </div>\n" +
              "        </div>\n" +
              "\n" +
              "        <div class=\"row align-items-md-stretch\">\n" +
              "            <div class=\"col-md-6\">\n" +
              "                <div class=\"h-100 p-5 text-bg-dark rounded-3\">\n" +
              "                    <h2>Change the background</h2>\n" +
              "                    <p>Swap the background-color utility and add a `.text-*` color utility to mix up the jumbotron look. Then, mix and match with additional component themes and more.</p>\n" +
              "                    <button class=\"btn btn-outline-light\" type=\"button\">Example button</button>\n" +
              "                </div>\n" +
              "            </div>\n" +
              "            <div class=\"col-md-6\">\n" +
              "                <div class=\"h-100 p-5 bg-body-tertiary border rounded-3\">\n" +
              "                    <h2>Add borders</h2>\n" +
              "                    <p>Or, keep it light and add a border for some added definition to the boundaries of your content. Be sure to look under the hood at the source HTML here as we've adjusted the alignment and sizing of both column's content for equal-height.</p>\n" +
              "                    <button class=\"btn btn-outline-secondary\" type=\"button\">Example button</button>\n" +
              "                </div>\n" +
              "            </div>\n" +
              "        </div><!DOCTYPE html>\n" +
              "        <html lang=\"en\">\n" +
              "        <head>\n" +
              "            <meta charset=\"UTF-8\">\n" +
              "            <title>Welcome BookMarket</title>\n" +
              "            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n" +
              "                  crossorigin=\"anonymous\">\n" +
              "        </head>\n" +
              "        <body>\n" +
              "        <main>\n" +
              "            <div class=\"container py-4\">\n" +
              "                <header class=\"pb-3 mb-4 border-bottom\">\n" +
              "                    <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
              "                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"40\" height=\"32\" class=\"me-2\" viewBox=\"0 0 118 94\" role=\"img\"><title>Bootstrap</title><path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z\" fill=\"currentColor\"></path></svg>\n" +
              "                        <span class=\"fs-4\">Book Market</span>\n" +
              "                    </a>\n" +
              "                </header>\n" +
              "                <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
              "                    <div class=\"container-fluid py-5\">\n" +
              "                        <h1 class=\"display-5 fw-bold\">Custom jumbotron</h1>\n" +
              "                        <p class=\"col-md-8 fs-4\">Using a series of utilities, you can create this jumbotron, just like the one in previous versions of Bootstrap. Check out the examples below for how you can remix and restyle it to your liking.</p>\n" +
              "                        <button class=\"btn btn-primary btn-lg\" type=\"button\">Example button</button>\n" +
              "                    </div>\n" +
              "                </div>\n" +
              "\n" +
              "                <div class=\"row align-items-md-stretch\">\n" +
              "                    <div class=\"col-md-6\">\n" +
              "                        <div class=\"h-100 p-5 text-bg-dark rounded-3\">\n" +
              "                            <h2>Change the background</h2>\n" +
              "                            <p>Swap the background-color utility and add a `.text-*` color utility to mix up the jumbotron look. Then, mix and match with additional component themes and more.</p>\n" +
              "                            <button class=\"btn btn-outline-light\" type=\"button\">Example button</button>\n" +
              "                        </div>\n" +
              "                    </div>\n" +
              "                    <div class=\"col-md-6\">\n" +
              "                        <div class=\"h-100 p-5 bg-body-tertiary border rounded-3\">\n" +
              "                            <h2>Add borders</h2>\n" +
              "                            <p>Or, keep it light and add a border for some added definition to the boundaries of your content. Be sure to look under the hood at the source HTML here as we've adjusted the alignment and sizing of both column's content for equal-height.</p>\n" +
              "                            <button class=\"btn btn-outline-secondary\" type=\"button\">Example button</button>\n" +
              "                        </div>\n" +
              "                    </div>\n" +
              "                </div>\n" +
              "\n" +
              "                <h1>Welcome To Book Market</h1>\n" +
              "                <h3>Welcome to Book Shopping Mall</h3>\n" +
              "            </div>\n" +
              "        </main>\n" +
              "        </body>\n" +
              "        </html>\n" +
              "\n" +
              "  <h1>Welcome To Book Market</h1>\n" +
              "  <h3>Welcome to Book Shopping Mall</h3>\n" +
              "</body>\n" +
              "</html>";

      return welcomeHtml;
  }
}
