package intern.fungjai.sirichai.fungjai_intern.model.pojo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class MusicDataTest {

    private MusicData musicData;

    @Before
    public void setUp() throws Exception {
        musicData = new MusicData();
    }

    @Test
    public void dataModelNotNullTest() {
        assertNotNull(musicData);
    }

    @Test
    public void artistGetSetTest() {
        MusicData musicData = new MusicData("markmywords.", null, null, null, null, null, null);
        assertEquals("markmywords.", musicData.getArtist());
    }

    @Test
    public void coverGetSetTest() {
        MusicData musicData = new MusicData(null, "https://image.fungjai.com/2018/02/12/cover/1518429706726234.jpg", null, null, null, null, null);
        assertEquals("https://image.fungjai.com/2018/02/12/cover/1518429706726234.jpg", musicData.getCover());
    }

    @Test
    public void songGetSetTest() {
        MusicData musicData = new MusicData(null, null, "น้องสาวครับ (Sister)", null, null, null, null);
        assertEquals("น้องสาวครับ (Sister)", musicData.getSong());
    }

    @Test
    public void typeGetSetTest() {
        MusicData musicData = new MusicData(null, null, null, "track", null, null, null);
        assertEquals("track", musicData.getType());
    }

    @Test
    public void descriptionGetSetTest() {
        MusicData musicData = new MusicData(null, null, null, null, "Fungjaizine ขอเชิญทุกท่านมาทำความรู้จัก แก้ว และ ตาหวาน 2 สมาชิกจากแก๊งชราไลน์แห่ง BNK48 กับเรื่องราวการไปเล่นดนตรีที่ญี่ปุ่นและชีวิตที่ทั้งคู่ไม่เคยเปิดเผยที่ไหนมาก่อน", null, null);
        assertEquals("Fungjaizine ขอเชิญทุกท่านมาทำความรู้จัก แก้ว และ ตาหวาน 2 สมาชิกจากแก๊งชราไลน์แห่ง BNK48 กับเรื่องราวการไปเล่นดนตรีที่ญี่ปุ่นและชีวิตที่ทั้งคู่ไม่เคยเปิดเผยที่ไหนมาก่อน", musicData.getDescription());
    }

    @Test
    public void titleGetSetTest() {
        MusicData musicData = new MusicData(null, null, null, null, null, "แก้วตาหวานใจ : Playlist เพลงโปรดของ แก้ว และ ตาหวาน BNK48", null);
        assertEquals("แก้วตาหวานใจ : Playlist เพลงโปรดของ แก้ว และ ตาหวาน BNK48", musicData.getTitle());
    }

    @Test
    public void urlGetSetTest() {
        MusicData musicData = new MusicData(null, null, null, null, null, null, "https://www.fungjaizine.com/feature/my_ears/kaew-tawaan-bnk48");
        assertEquals("https://www.fungjaizine.com/feature/my_ears/kaew-tawaan-bnk48", musicData.getUrl());
    }
}