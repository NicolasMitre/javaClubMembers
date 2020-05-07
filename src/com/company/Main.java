import com.company.Club;
import com.company.ClubMember;

public class Main {
    public static void main(String[] args) {

        Club clubIndependiente = new Club();

        ClubMember leodejava = new ClubMember("Fausto","223912312",30);
        ClubMember nicolas = new ClubMember("Nicolas","223912312",21);
        ClubMember mauro = new ClubMember("Mauro","223942312312",29);
        ClubMember leo = new ClubMember("Leo","2223123123",32);
        ClubMember mati = new ClubMember("Mati","223912312",35);
        ClubMember aurelio = new ClubMember("Aurelio","2213312",99);

        clubIndependiente.associate(nicolas);
        clubIndependiente.associate(leodejava);
        clubIndependiente.associate(mauro);
        clubIndependiente.associate(leo);
        clubIndependiente.associate(aurelio);
        clubIndependiente.associate(mati);


        mauro.vote(nicolas);
        nicolas.vote(leo);
        nicolas.vote(mauro);
        leodejava.vote(leo);
        leo.vote(nicolas);
        mati.vote(mauro);
        aurelio.vote(nicolas);

        clubIndependiente.publishMember();
    }
}