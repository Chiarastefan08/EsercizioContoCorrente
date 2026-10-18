import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;

import static java.lang.IO.println;

void main (){
    ContoBancario contouno = new ContoBancario(2000);

    //prelievo eccessivo
    try {
        println("prelevo 2500");
        contouno.preleva(2500);
        println("prelevo effettuato hai: " + contouno.getSaldo());
    }catch(SaldoInsufficienteException e){
        double soldimancanti = e.getSoldiChiesti() - e.getSoldiAttuali();
        println("mancano " + soldimancanti + "euro");
    } finally {
        System.out.println("operazione di prelievo terminata.");
    }

    //prelievo negativo
    try {
        println("prelevo -150");
        contouno.preleva(-150);
        println("prelevo effettuato hai: " + contouno.getSaldo());
    }catch(ImportoNonValidoException e){
        println("importo negativo");
    }

    //prelievo valido
    println("prelevo 150");
    contouno.preleva(150);
    println("prelevo effettuato hai: " + contouno.getSaldo());

}
