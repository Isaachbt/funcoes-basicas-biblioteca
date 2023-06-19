import java.util.List;

public class Print {
    /**
     * Esse metodo serve como System.out.print().<p/>
     * Note que ele não tem println, então ele não
     * ira pular linha.<p/>
     * Pra que serve? Exemplo:
     * <blockquote><pre>
     *  {@code print("meu nome e s% e o seu?",nome);}
     * </pre></blockquote><p>
     * Ele aceita simbolos especiais.
     * <p/>
     * Será preciso usar \n para pular linha.<p/>
     *
     * @author Isaac
     * @see  java.lang.Object#toString()
     * @see  java.lang.StringBuffer
     * @see  java.lang.StringBuilder
     * @see  java.nio.charset.Charset
     */
    public static void print(String texto)
    {
        System.out.print(texto);
    }

    /**
     * Esse metodo serve como System.out.println().
     * <p/>
     * Ele tem todas as funcionalidades do System.out.println<p/>
     * Pra que serve? Exemplo:
     * <blockquote><pre>
     *     {@code print("meu nome e isaac e o seu?");}
     * </pre></blockquote><p>
     * @author Isaac
     * @see  java.lang.Object#toString()
     * @see  java.lang.StringBuffer
     * @see  java.lang.StringBuilder
     * @see  java.nio.charset.Charset
     */
    public static void println(String texto)
    {
        System.out.println(texto);
    }

    /**
     * Esse metodo serve para log no logCat
     * <p/>
     * Apenas informe o erro ou texto desejado e
     * ele estara em destaque no logCat
     * Pra que serve? Exemplo:
     * <blockquote><pre>
     * {@code System.out.println("-------------------");}
     * {@code System.out.println("LOG: "+msg);}
     * {@code System.out.println("-------------------");}
     * </pre></blockquote><p>
     * Ele aceita simbolos especiais.
     * <p/>
     *
     * @author Isaac
     * @see  java.lang.Object#toString()
     * @see  java.lang.StringBuffer
     * @see  java.lang.StringBuilder
     * @see  java.nio.charset.Charset
     */
    public static void log(String msg){
        System.out.println("-------------------");
        System.out.print("LOG: "+msg);
        System.out.println("-------------------");
    }

    /**
     * Esse metodo serve para printar uma {@code List<T>}
     * <p/>
     * Analise que ela aceita {@code <T>}
     * Dessa forma podemos passar varias tipos de {@code List<>}
     * Pra que serve? Exemplo:
     * <blockquote><pre>
     * {@code for (T e:t)
     *     {
     *       println(String.valueOf(e));
     *     }}
     * </pre></blockquote><p>
     * Os dados impressos será convertido para String.valueoff().
     * <p/>
     *
     * @author Isaac
     * @see  java.lang.Object#toString()
     * @see  java.lang.StringBuffer
     * @see  java.lang.StringBuilder
     * @see  java.nio.charset.Charset
     */
    public static <T> void printList(List<T> t){
        try {

            for (T e:t)
            {
                println(String.valueOf(e));
            }


        }catch (Exception e)
        {
            println("Error 'printList'");
            log(e.getMessage());
        }
    }
}