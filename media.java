
public  static  void  main ( String [] args ){

        Scanner  scanner = novo  Scanner ( System . in );

         mídia flutuante ;

        Sistema . fora . println ( "Qual é o seu nome completo: " );
        String  nome = scanner . próximaLinha ();

        Sistema . fora . println ( "Qual é o seu curso: " );
        String  cursor = scanner . próximaLinha ();

        Sistema . fora . println ( "Você está em qual período: " );
        int  periodo = scanner . nextInt ();

        Sistema . fora . println ( "Digite sua primeira nota: " );
        float  nota1 = scanner . próximoFloat ();

        Sistema . fora . println ( "Digite sua segunda nota: " );
        float  nota2 = scanner . próximoFloat ();

        Sistema . fora . printn ( "Entre com a quantidade de faltas: " );
        int  faltas = scanner . nextInt ();

        Sistema . fora . println ( "Seu nome completo é: " + nome + "\nSeu curso é: " + curso );
        Sistema . fora . println ( "Seu periodo é: " + periodo + "\nSua primeira nota é: " + nota1 );
        Sistema . fora . println ( "Sua segunda nota é: " + nota2 + "\nVocê teve " + faltas + " faltas." );

        mídia = ( nota1 + nota2 ) / 2 ;

        Sistema . fora . println ( "A média das notas é: " + media );



        }


}
