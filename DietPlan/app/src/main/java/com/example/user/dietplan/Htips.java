package com.example.user.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Htips extends AppCompatActivity {

    EditText bmi_value;
    String tv,msg;
    double j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htips);

        bmi_value = (EditText)findViewById(R.id.bmi);
        tv = getIntent().getStringExtra("value");
        bmi_value.setText(tv);
        j=Double.parseDouble(tv);

        TextView f = (TextView)findViewById(R.id.food);
        TextView t = (TextView)findViewById(R.id.tips);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Htips.this,Health.class);
                startActivity(intent);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Htips.this,Tips.class);
                startActivity(intent);
            }
        });
    }

    public void routine(View view) {
        if(j<18.5){
            msg="--> At least three meals and two to three smaller snacks every day.\n\n" +
                    "--> Good snack times are between breakfast and lunch, between lunch and dinner and just before bed.\n\n" +
                    "--> Focus on adding the 250 to 500 calories.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }
        if(j>=18.5 & j<=24.9){
            msg="--> To maintain your current weight,reduce the number of calories 250 to 500 calories a day.\n\n" +
                    "--> Drink two cups of water with lemon each morning.\n\n" +
                    "--> Eat your dinner two hours before bed to promote uninterrup ted sleep.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }

        if(j>24.9 & j<=29.9){
            msg="--> Both the Mediterranean and vegetarian diets fit the description of plantbased eating,which you may have already tried, or atleast contemplated.\n\n" +
                    "--> Eat less junk food.\n\n" +
                    "--> Regular exercise to become fit.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }

        if(j>29.9){
            msg="--> Weighing yourself from time to time so that you become more aware of your weight and you can do something about your weight if you start to put some on.\n\n" +
                    "--> Spending less time being sedentary (for example, less time in front of your computer or watching TV).\n\n" +
                    "--> Doing 150 minutes of physical activity a week according to the guidelines above.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }
    }

    public void exercise(View view) {
        if(j<18.5){
            msg="--> At each of your minimum of two workouts per week, address all of the major muscle groups including the hips, legs, chest, back, arms, shoulders and abs.\n\n" +
                    "--> One exercise for each muscle group performed for at least one set of four to eight repetitions should suffice.\n\n" +
                    "--> A brisk walk or swimming laps, for example, for 20 to 30 minutes four or five times per week.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }
        if(j>=18.5 & j<=24.9){
            msg="--> 300 minutes of moderateintensity exercise a week.\n\n" +
                    "--> A brisk 60-minute walk five days a week.\n\n" +
                    "--> Shooting for 150 minutes of vi gorousintensity exercise each week,which translates into a 30-minute jog five days a week.\n\n" +
                    "--> strengthtraining exercises two days a week.\n\n" +
                    "--> Lifting weights, heavy gardening, yoga and working with resistance bands all help bui";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }

        if(j>24.9 & j<=29.9){
            msg="--> With any diet plan, you will find an emphasis on physical activity, because of its importance on cardiovascular health.\n\n" +
                    "--> Cardiovascular exercise, especially when it's performed at moderate to high intensity and for more than 30minutes, can help your body burn fat.\n\n" +
                    "--> Strength training is equally important in helping you build and maintain lean muscle mass.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }

        if(j>29.9){
            msg="--> Ideally all adults should aim for two and a half hours of exercise a week.\n\n" +
                    "--> One way to do this is to do half an hour of moderateintensity exercise inbouts of 10 minutes for five days of the week.\n\n" +
                    "--> Moderate physical activity includes: brisk walking, jogging, dancing, swimming, badminton, tennis, etc.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }
    }


    public void food(View view) {
        if(j<18.5){
            msg="--> 1 cup of cottage cheese with 183 calories and 24 grams of protein.\n\n" +
                    "--> 1/2 cup of nuts with 400 calories and 13.5 grams of protein.\n\n" +
                    "--> A smoothie with a serving of whey protein.\n\n" +
                    "--> 1 cup of milk and 1/2 of a banana for 350 calories and 34 grams of protein.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }
        if(j>=18.5 & j<=24.9){
            msg="--> Fatfree milk instead of low-fat or whole.\n\n" +
                    "--> Swap out chips and cookieood food with lemon each morning.\n\n" +
                    "--> Eat your dinner two hours before bed to promote uninterrupted sleep. gorousintensity exercise each week, which translates into a 30-minute jog five days a week.\n\n" +
                    "--> strengthtraining exercises two days a week.\n\n" +
                    "--> Lifting weights, heavy gardening, yoga and working with resistance bands all help build muscles for fresh fruits and veggies.\n\n" +
                    "--> Leaner cuts of meat and eat baked, steamed or broiled food instead of fried.\n\n" +
                    "--> Avoid drinking sugary bever ages such as soda and juice drinks, and stick to caloriefree drinks such as water and unsweetened tea.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }

        if(j>24.9 & j<=29.9){
            msg="--> Low carbohy drate diets, such as Atkins, promote weight loss by using fat for fuel instead of the body's preferred fuelsource, carbs.\n\n" +
                    "--> The Paleo diet, which works much in the same way as Atkins, focuses on animal proteins, non starchy vege tables and some fruits.\n\n" +
                    "--> Very-lowcarbohydrate diets are effective for shortterm weight loss and for lowering your BMI, but their effects on long-term health are not so convincing.";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }

        if(j>29.9){
            msg="--> drink water as your main drink.\n\n" +
                    "--> less surgery drink like cola, tea and coffee with milk and sugar, milk and alcoholic drinks.\n\n" +
                    "--> lessoily foods";
            Intent intent = new Intent(Htips.this,ShowTips.class);
            intent.putExtra("value",msg);
            startActivity(intent);
        }
    }
}
