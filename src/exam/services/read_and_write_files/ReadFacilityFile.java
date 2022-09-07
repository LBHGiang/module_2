package exam.services.read_and_write_files;

import case_study.furama_resort.models.House;
import case_study.furama_resort.models.Room;
import case_study.furama_resort.models.Villa;
import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadFacilityFile {
    public List<Villa> readVillaFile() {
        final String VILLA_PATH = "src\\case_study\\furama_resort\\data\\villa.csv";
        List<String> stringList = ReadFileUtil.readFile(VILLA_PATH);
        List<Villa> villaList = new ArrayList<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            villaList.add(new Villa(
                    info[0],
                    info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    Boolean.parseBoolean(info[6]),
                    info[7],
                    Double.parseDouble(info[8]),
                    Integer.parseInt(info[9])));
        }
        return villaList;
    }

    public List<House> readHouseFile() {
        final String HOUSE_PATH = "src\\case_study\\furama_resort\\data\\house.csv";
        List<String> stringList = ReadFileUtil.readFile(HOUSE_PATH);
        List<House> houseList = new ArrayList<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            houseList.add(new House(
                    info[0],
                    info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    Boolean.parseBoolean(info[6]),
                    info[7],
                    Integer.parseInt(info[8])));
        }
        return houseList;
    }

    public List<Room> readRoomFile() {
        final String ROOM_PATH = "src\\case_study\\furama_resort\\data\\room.csv";
        List<String> stringList = ReadFileUtil.readFile(ROOM_PATH);
        List<Room> roomList = new ArrayList<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            roomList.add(new Room(
                    info[0],
                    info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    Boolean.parseBoolean(info[6]),
                    info[7]));
        }
        return roomList;
    }
}
