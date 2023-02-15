package StructuralDP.FacadDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text = "Content";//kullanicinin sifrelenmesini istedigi text

        //Bad code*****************************************************
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"SecretKey");

        SHAencryptor shAencryptor = new SHAencryptor();
        shAencryptor.encrypt(text,"SecretKey",true);


        //*******************************************************
        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text,EncryptorFacade.EncType.SHA);
    }
}
