package com.example.lista_teste;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_item extends Fragment implements  AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] produtos = {"Arroz", "Feijao", "Açucar", "Café", "Macarrão"};

        ListView listView = (ListView) view.findViewById(R.id.lst);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, produtos);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Toast.makeText(getActivity(), "Arroz___Preço: 3,70", Toast.LENGTH_SHORT).show();
        }
        if (position == 1) {
            Toast.makeText(getActivity(), "Feijão__Preço: 5,70", Toast.LENGTH_SHORT).show();
        }
        if (position == 2) {
            Toast.makeText(getActivity(), "Açucar__Preço: 3,80", Toast.LENGTH_SHORT).show();
        }
        if (position == 3) {
            Toast.makeText(getActivity(), "Café__Preço: 3,80", Toast.LENGTH_SHORT).show();
        }
        if (position == 4) {
            Toast.makeText(getActivity(), "Macarrão__Preço: 3,80", Toast.LENGTH_SHORT).show();
        }
    }
}
