import java.util.ArrayList;
import java.util.Random;

public class FootballRepository {
    public ArrayList<FootballTeam> player;
    public ArrayList<FootballTeam> selectedTeam;

    public ArrayList<FootballTeam> getData() {
        player = new ArrayList<>();
        player.add(new FootballTeam(1, "Phạm Huy A", Position.GK));
        player.add(new FootballTeam(2, "Phạm Huy B", Position.GK));
        player.add(new FootballTeam(3, "Phạm Huy C", Position.DF));
        player.add(new FootballTeam(4, "Phạm Huy D", Position.DF));
        player.add(new FootballTeam(5, "Phạm Huy E", Position.DF));
        player.add(new FootballTeam(6, "Phạm Huy G", Position.DF));
        player.add(new FootballTeam(7, "Phạm Huy H", Position.DF));
        player.add(new FootballTeam(8, "Phạm Huy I ", Position.DF));
        player.add(new FootballTeam(9, "Phạm Huy K", Position.MF));
        player.add(new FootballTeam(10, "Phạm Huy L", Position.MF));
        player.add(new FootballTeam(11, "Phạm Huy M", Position.MF));
        player.add(new FootballTeam(12, "Phạm Huy N", Position.MF));
        player.add(new FootballTeam(13, "Phạm Huy O", Position.MF));
        player.add(new FootballTeam(14, "Phạm Huy P", Position.FW));
        player.add(new FootballTeam(15, "Phạm Huy Q", Position.FW));
        player.add(new FootballTeam(16, "Phạm Huy R", Position.FW));
        player.add(new FootballTeam(17, "Phạm Huy S", Position.FW));
        player.add(new FootballTeam(18, "Phạm Huy T", Position.FW));
        return player;
    }

    public void print() {
        for (FootballTeam f : player) {
            System.out.println(f);

        }
    }

    public void formation() {
        selectedTeam = new ArrayList<FootballTeam>();
        Random general = new Random();
        System.out.println("Đội hình: 1GK - 4DF - 4MF - 2FW");
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        while (gateKeeperSize < 1) {
            int rdgateKeeper = general.nextInt(18);
            if (player.get(rdgateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(player.get(rdgateKeeper));
                gateKeeperSize++;
            }
        }
        while (defenderSize < 4) {
            int rddefender = general.nextInt(18);
            if (player.get(rddefender).getPosition().equals(Position.DF) && !selectedTeam.contains(player.get(rddefender))) {
                selectedTeam.add(player.get(rddefender));
                defenderSize++;
            }
        }
        while (midFieldSize < 4) {
            int rdmidField = general.nextInt(18);
            if (player.get(rdmidField).getPosition().equals(Position.MF) && !selectedTeam.contains(player.get(rdmidField))) {
                selectedTeam.add(player.get(rdmidField));
                midFieldSize++;
            }
        }
        while (forwaderSize < 2) {
            int rdforwader = general.nextInt(18);
            if (player.get(rdforwader).getPosition().equals(Position.FW) && !selectedTeam.contains(player.get(rdforwader))) {
                selectedTeam.add(player.get(rdforwader));
                forwaderSize++;
            }
        }
        System.out.println(selectedTeam);

    }
    public void formationOne() {
        selectedTeam = new ArrayList<FootballTeam>();
        Random general = new Random();
        System.out.println("Đội hình: 1GK - 4DF - 3MF - 3FW");
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        while (gateKeeperSize < 1) {
            int rdgateKeeper = general.nextInt(18);
            if (player.get(rdgateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(player.get(rdgateKeeper));
                gateKeeperSize++;
            }
        }
        while (defenderSize < 4) {
            int rddefender = general.nextInt(18);
            if (player.get(rddefender).getPosition().equals(Position.DF) && !selectedTeam.contains(player.get(rddefender))) {
                selectedTeam.add(player.get(rddefender));
                defenderSize++;
            }
        }
        while (midFieldSize < 3) {
            int rdmidField = general.nextInt(18);
            if (player.get(rdmidField).getPosition().equals(Position.MF) && !selectedTeam.contains(player.get(rdmidField))) {
                selectedTeam.add(player.get(rdmidField));
                midFieldSize++;
            }
        }
        while (forwaderSize < 3) {
            int rdforwader = general.nextInt(18);
            if (player.get(rdforwader).getPosition().equals(Position.FW) && !selectedTeam.contains(player.get(rdforwader))) {
                selectedTeam.add(player.get(rdforwader));
                forwaderSize++;
            }
        }
        System.out.println(selectedTeam);

    }
    public void formationTwo() {
        selectedTeam = new ArrayList<FootballTeam>();
        Random general = new Random();
        System.out.println("Đội hình: 1GK - 3DF - 5MF - 2FW");
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        while (gateKeeperSize < 1) {
            int rdgateKeeper = general.nextInt(18);
            if (player.get(rdgateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(player.get(rdgateKeeper));
                gateKeeperSize++;
            }
        }
        while (defenderSize < 3) {
            int rddefender = general.nextInt(18);
            if (player.get(rddefender).getPosition().equals(Position.DF) && !selectedTeam.contains(player.get(rddefender))) {
                selectedTeam.add(player.get(rddefender));
                defenderSize++;
            }
        }
        while (midFieldSize < 5) {
            int rdmidField = general.nextInt(18);
            if (player.get(rdmidField).getPosition().equals(Position.MF) && !selectedTeam.contains(player.get(rdmidField))) {
                selectedTeam.add(player.get(rdmidField));
                midFieldSize++;
            }
        }
        while (forwaderSize < 2) {
            int rdforwader = general.nextInt(18);
            if (player.get(rdforwader).getPosition().equals(Position.FW) && !selectedTeam.contains(player.get(rdforwader))) {
                selectedTeam.add(player.get(rdforwader));
                forwaderSize++;
            }
        }
        System.out.println(selectedTeam);

    }
}
