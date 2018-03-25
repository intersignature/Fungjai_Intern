package intern.fungjai.sirichai.fungjai_intern.model.pojo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class DataModelTest {

    private DataModel dataModel;

    @Before
    public void setUp() throws Exception {
        dataModel = new DataModel();
    }

    @Test
    public void dataModelNotNullTest() {
        assertNotNull(dataModel);
    }

    @Test
    public void artistGetSetTest() {
        DataModel dataModel = new DataModel("markmywords.", null, null, null, null, null, null);
        assertEquals("markmywords.", dataModel.getArtist());
    }

    @Test
    public void coverGetSetTest() {
        DataModel dataModel = new DataModel(null, "https://image.fungjai.com/2018/02/12/cover/1518429706726234.jpg", null, null, null, null, null);
        assertEquals("https://image.fungjai.com/2018/02/12/cover/1518429706726234.jpg", dataModel.getCover());
    }

    @Test
    public void songGetSetTest() {
        DataModel dataModel = new DataModel(null, null, "น้องสาวครับ (Sister)", null, null, null, null);
        assertEquals("น้องสาวครับ (Sister)", dataModel.getSong());
    }

    @Test
    public void typeGetSetTest() {
        DataModel dataModel = new DataModel(null, null, null, "track", null, null, null);
        assertEquals("track", dataModel.getType());
    }

    @Test
    public void descriptionGetSetTest() {
        DataModel dataModel = new DataModel(null, null, null, null, "Fungjaizine ขอเชิญทุกท่านมาทำความรู้จัก แก้ว และ ตาหวาน 2 สมาชิกจากแก๊งชราไลน์แห่ง BNK48 กับเรื่องราวการไปเล่นดนตรีที่ญี่ปุ่นและชีวิตที่ทั้งคู่ไม่เคยเปิดเผยที่ไหนมาก่อน", null, null);
        assertEquals("Fungjaizine ขอเชิญทุกท่านมาทำความรู้จัก แก้ว และ ตาหวาน 2 สมาชิกจากแก๊งชราไลน์แห่ง BNK48 กับเรื่องราวการไปเล่นดนตรีที่ญี่ปุ่นและชีวิตที่ทั้งคู่ไม่เคยเปิดเผยที่ไหนมาก่อน", dataModel.getDescription());
    }

    @Test
    public void titleGetSetTest() {
        DataModel dataModel = new DataModel(null, null, null, null, null, "แก้วตาหวานใจ : Playlist เพลงโปรดของ แก้ว และ ตาหวาน BNK48", null);
        assertEquals("แก้วตาหวานใจ : Playlist เพลงโปรดของ แก้ว และ ตาหวาน BNK48", dataModel.getTitle());
    }

    @Test
    public void urlGetSetTest() {
        DataModel dataModel = new DataModel(null, null, null, null, null, null, "https://www.fungjaizine.com/feature/my_ears/kaew-tawaan-bnk48");
        assertEquals("https://www.fungjaizine.com/feature/my_ears/kaew-tawaan-bnk48", dataModel.getUrl());
    }
}