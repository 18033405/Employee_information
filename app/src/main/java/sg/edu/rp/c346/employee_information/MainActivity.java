package sg.edu.rp.c346.employee_information;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<Employee>alEmployeeList;
    CustomAdapter caEmployee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmployee=findViewById(R.id.listViewEmployee);
        alEmployeeList=new ArrayList<>();
        Employee emp1= new Employee("John","Software Technical Leader",3400);
        Employee emp2=new Employee("May","Programmer",2200);
        alEmployeeList.add(emp1);
        alEmployeeList.add(emp2);
        caEmployee=new CustomAdapter(this,R.layout.employee_item,alEmployeeList);
        lvEmployee.setAdapter(caEmployee);
    }
}
