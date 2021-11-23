package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, Pessoa> mapaPessoas = new LinkedHashMap<>(16, 0.75f, true);
        System.out.println(mapaPessoas.put("legal", new Pessoa(1, "pessoa 1")));
        System.out.println(mapaPessoas);
        System.out.println(mapaPessoas.put("legal", new Pessoa(2, "pessoa 2")));
        System.out.println(mapaPessoas);
        mapaPessoas.put(null, new Pessoa(-1, "NuLO"));
        System.out.println(mapaPessoas);
        mapaPessoas.put("teste", null);
        System.out.println(mapaPessoas);
        Pessoa p = mapaPessoas.get("legal");
        System.out.println(p);
        System.out.println(mapaPessoas);
    }
}
