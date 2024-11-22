import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe, Departement> map = new TreeMap<>((e1, e2) -> e1.getCin().compareTo(e2.getCin()));

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        map.forEach((e, d) -> System.out.println(e + " belongs to " + d));
    }

    @Override
    public void afficherLesEmployes() {
        map.keySet().forEach(System.out::println);
    }

    @Override
    public void afficherLesDepartements() {
        map.values().stream().distinct().forEach(System.out::println);
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(map.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }
}