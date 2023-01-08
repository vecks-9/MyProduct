package logic;

import java.util.List;

import dao.DinoDAO;
import model.Dino;

public class DinoLogic {

	public List<Dino> getList() {
		DinoDAO dao = new DinoDAO();
		List<Dino> dinoList = dao.select();
		
		return dinoList;
	}
}

/*
 * Arkニトロ鯖　沼地のノア行き恐竜保存するウェブアプリケーション
 * Logicをユーザーと恐竜に大別してメソッドで分けようとしているところ
 */