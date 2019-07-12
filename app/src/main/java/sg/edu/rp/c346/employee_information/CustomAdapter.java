package sg.edu.rp.c346.employee_information;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Employee>employeeList;

    public CustomAdapter(Context context,int resource,ArrayList<Employee>objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        employeeList=objects;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(layout_id,parent,false);
        TextView tvName=rowView.findViewById(R.id.textViewName);
        TextView tvTitle=rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary=rowView.findViewById(R.id.textViewSalary);
        Employee currentItem=employeeList.get(position);
        tvName.setText(currentItem.getName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(""+currentItem.getSalary());
        return rowView;

    }

}
