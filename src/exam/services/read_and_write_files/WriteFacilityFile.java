package exam.services.read_and_write_files;

import case_study.furama_resort.models.House;
import case_study.furama_resort.models.Room;
import case_study.furama_resort.models.Villa;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.List;

public class WriteFacilityFile {
    public void writeVillaFile(List<Villa> villaList) {
        final String VILLA_PATH = "src\\case_study\\furama_resort\\data\\villa.csv";
        StringBuilder data = new StringBuilder("Service Id,Service Name,Area,Cost,Max Person,Rental Type,Is Active?,Standard,Pool Area,Floors\n");

        for (Villa villa : villaList) {
            data.append(villa.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(VILLA_PATH, data.toString());
    }

    public void writeHouseFile(List<House> houseList) {
        final String HOUSE_PATH = "src\\case_study\\furama_resort\\data\\house.csv";
        StringBuilder data = new StringBuilder("Service Id,Service Name,Area,Cost,Max Person,Rental Type,Is Active?,Standard,Floors\n");

        for (House house : houseList) {
            data.append(house.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(HOUSE_PATH, data.toString());
    }

    public void writeRoomFile(List<Room> roomList) {
        final String ROOM_PATH = "src\\case_study\\furama_resort\\data\\room.csv";
        StringBuilder data = new StringBuilder("Service Id,Service Name,Area,Cost,Max Person,Rental Type,Is Active?,Free Service\n");

        for (Room room : roomList) {
            data.append(room.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(ROOM_PATH, data.toString());
    }
}
