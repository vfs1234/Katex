package hourglass.github.in.katex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import katex.hourglass.in.mathlib.MathView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MathView mathView = (MathView) findViewById(R.id.math_view);
        mathView.setDisplayText("原式asdasdasdasdasdasdasdasdasdasdasdasdasdasdsd\nasdadasdasdasdadadasdasd\n\\[ = \\sqrt[3]{{\\frac{{26}}{{27}} - \\frac{{27}}{{27}}}} + \\sqrt {{{\\left( { - \\frac{1}{4}} \\right)}^2}}  = \\sqrt[3]{{ - \\frac{1}{{27}}}} + \\frac{1}{4} =  - \\frac{1}{3} + \\frac{1}{4} =  - \\frac{4}{{12}} + \\frac{3}{{12}} =  - \\frac{1}{{12}}\\]");
    }
}
