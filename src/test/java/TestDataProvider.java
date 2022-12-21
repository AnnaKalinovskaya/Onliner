
public class TestDataProvider {
    public static String asideCategory = "//div[contains(text(), 'Мобильные телефоны')]";
    @org.testng.annotations.DataProvider (name = "itemsCategory")
    public static Object[][] getData(){
        String[][] data = {
                {"//a[@href='https://catalog.onliner.by/mobile']", "фоны"},
                {"//a[@href='https://catalog.onliner.by/headphones']", "Наушники"},
                {"//a[@href='https://catalog.onliner.by/smartwatch?sw_type%5B0%5D=bracelet&sw_type%5Boperation%5D=union']", "Фитнес-браслеты"},
                {"//a[@href='https://catalog.onliner.by/smartwatch?sw_type%5B0%5D=hybridsmartwatch&sw_type%5B1%5D=smartwatch&sw_type%5Boperation%5D=union']", "Умные часы"},
                {"//a[@href='https://catalog.onliner.by/smartwatch?sw_type%5B0%5D=kidssmartwatch&sw_type%5Boperation%5D=union']", "часы"},
                {"//a[@href='https://catalog.onliner.by/portablecharger']", "Портативные зарядные устройства"},
                {"//a[@href='https://catalog.onliner.by/memcards?typememcards%5B0%5D=microsd&typememcards%5B1%5D=microsdxc&typememcards%5B2%5D=microsdhc&typememcards%5Boperation%5D=union']", "Карты памяти"},
                {"//a[@href='https://catalog.onliner.by/phonecase']", "Чехлы"},
                {"//a[@href='https://catalog.onliner.by/protectiveglass']", "Защитные стекла"},
                {"//a[@href='https://catalog.onliner.by/phoneaccum']", "Аккумуляторы"},
                {"//a[@href='https://catalog.onliner.by/bt']", "Bluetooth-гарнитуры"},
                {"//a[@href='https://catalog.onliner.by/selfiestick']", "селфи"},
                {"//a[@href='https://catalog.onliner.by/cable?cable_usage%5B0%5D=phone&cable_usage%5Boperation%5D=union']", "Кабели"},
                {"//a[@href='https://catalog.onliner.by/carholder']", "автомобил"},
                {"//a[@href='https://catalog.onliner.by/chargersmobile?mc_devicetype%5B0%5D=type&mc_devicetype%5Boperation%5D=union&mc_type%5B0%5D=network&mc_type%5Boperation%5D=union']", "зарядные"},
                {"//a[@href='https://catalog.onliner.by/chargersmobile?mc_type%5B0%5D=wireless&mc_type%5Boperation%5D=union']", "Беспроводные зарядные"},
                {"//a[@href='https://catalog.onliner.by/mobile?mobile_type%5B0%5D=phone&mobile_type%5Boperation%5D=union']", "кноп"}
        };
        return data;
    }
}
