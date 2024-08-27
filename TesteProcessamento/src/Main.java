public class Main {

    public static void main(String[] args) {

        // Declaração de variáveis de tipos int e double
        int x;
        double y;

        // Atribuição de valor à variável x
        x = 5;

        // Atribuição de valor à variável y, realizando uma operação aritmética
        y = 2 * x; // y será igual a 10.0 (o resultado é convertido para double)

        // Impressão dos valores de x e y
        System.out.println(x);
        System.out.println(y);

        // Cálculo da área de um trapézio
        double b, B, h, area;

        // Atribuição de valores às bases e altura
        b = 6.0;
        B = 8.0;
        h = 5.0;

        // Cálculo da área utilizando a fórmula do trapézio
        area = (b + B) / 2.0 * h;

        // Impressão do resultado
        System.out.println(area);

        // Divisão de um inteiro por outro, com conversão para double
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        // Casting de a para double antes da divisão para obter um resultado preciso
        resultado = (double) a / b; // resultado será 2.5

        System.out.println(resultado);

        // Conversão de double para int (truncamento)
        double a;
        int b;

        a = 5.0;
        // O valor decimal de a é descartado
        b = (int) a; // b será 5

        System.out.println(b);
    }

}