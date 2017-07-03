package comagustinn251.httpsgithub.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;   /* Declaracion de variables a utilizar */
    Button sumar,restar,mul,div;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        num1= (EditText) findViewById(R.id.num1);
        num2= (EditText) findViewById(R.id.num2);

        sumar= (Button) findViewById(R.id.sumar);
        restar=(Button) findViewById(R.id.restar);
        mul= (Button) findViewById(R.id.mul);
        div= (Button) findViewById(R.id.div);

        resultado= (TextView) findViewById(R.id.resultado);

        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1=num1.getText().toString();  /* Empieza conversion de texto a numero */
        String n2=num2.getText().toString();
        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);
        int respuesta=0;

        switch (v.getId()){     /* El Switch nos da las opciones a elegir */
            case R.id.sumar:
                respuesta=entero1+entero2;
                break;
            case R.id.restar:
                respuesta=entero1-entero2;
                break;
            case R.id.mul:
                respuesta=entero1*entero2;
                break;
            case R.id.div:
                if(entero2==0)
                    Toast.makeText(getApplicationContext(),"No es posible dividir por cero",Toast.LENGTH_SHORT).show();
                else
                respuesta=entero1/entero2;
                break;
        }

    resultado.setText("" +respuesta);

    }
}
