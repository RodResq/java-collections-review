package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, Pessoa> mapaPessoas = new HashMap<>();
        System.out.println(mapaPessoas.put("legal", new Pessoa(1, "pessoa 1")));
        System.out.println(mapaPessoas);
        System.out.println(mapaPessoas.put("legal", new Pessoa(2, "pessoa 2")));
        System.out.println(mapaPessoas);
        mapaPessoas.put(null, new Pessoa(-1, "NuLO"));
        System.out.println(mapaPessoas);
    }
}
