package test;


enum DatabaseTypeEnum {
    PRIMARY("1"), USER("2");

    private String code;

    private DatabaseTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static DatabaseTypeEnum getDatabaseTypeEnum(String code) {
        for (DatabaseTypeEnum databaseTypeEnum : DatabaseTypeEnum.values()) {
            if (databaseTypeEnum.getCode().equals(code)) {
                return databaseTypeEnum;
            }
        }
        return null;
    }

}

public class Enum {


    public static void main(String[] args) {
        DatabaseTypeEnum d[]=DatabaseTypeEnum.values();
        for (DatabaseTypeEnum col : d)
        {
            // 查看索引
            System.out.println(col + " at index " + col.getCode());
        }

    }
}
