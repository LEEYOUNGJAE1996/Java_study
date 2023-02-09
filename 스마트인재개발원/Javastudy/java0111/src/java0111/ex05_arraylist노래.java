package java0111;

import java.util.ArrayList;
import java.util.Scanner;

public class ex05_arraylist노래 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> songName = new ArrayList<String>();
		boolean stop = true;
		System.out.println("====Music Play List=====");
		int num;
		String name;
		boolean finding = true;

		while (stop) {
			System.out.print("[1]노래 추가\t[2]노래조회\t[3]노래삭제\t[4]종료 >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				if (songName.size() == 0) {
					System.out.print("노래 제목을 입력하세요 : ");
					songName.add(sc.next());
				}
				else {
					System.out.println("현재 재생 목록");
					int index;
					for(int i = 0 ; i < songName.size(); i++) {
						System.out.print(songName.get(i)+"\t");
					}
					System.out.println("\n원하시는 위치(순서를) 숫자로 입력하세요 :");
					index = sc.nextInt();
					System.out.println("노래 제목을 입력하세요: ");
					songName.add(index-1,sc.next());
				}
				break;
			case 2:
				if (songName.size() == 0) {
					System.out.println("재생목록이 없습니다.");
				} else {
					System.out.println("노래 제목을 입력하세요 : ");
					name = sc.next();
					for (int i = 0; i < songName.size(); i++) {
						if (name.equals(songName.get(i))) {
							System.out.println((i + 1) + "번째에 '" + songName.get(i) + "'이(가) 있습니다.");
							finding = true;
							break;
						} else {
							finding = false;
						}
					}
					if (!finding) {
						System.out.println("찾으시는 노래가 없습니다.");
					}
				}
				break;
			case 3:
				System.out.println("[1]선택삭제\t[2]전체삭제");
				num = sc.nextInt();
				switch (num) {
				case 1:
					if (songName.size() == 0) {
						System.out.println("재생목록이 없습니다.");
					} else {
						System.out.println("노래 제목을 입력하세요 : ");
						name = sc.next();
						for (int i = 0; i < songName.size(); i++) {
							if (name.equals(songName.get(i))) {
								System.out.println((i + 1) + "번째에 " + songName.get(i) + "이(가) 있습니다.");
								songName.remove(i);
								System.out.println((i + 1) + "번째에 " + name + "이(가) 삭제되었습니다.");
								System.out.println("현재 재생목록");
								for (int j = 0; j < songName.size(); j++) {
									System.out.print(songName.get(j) + "\t");
								}
								finding = true;
								break;
							} else {
								finding = false;
							}
							if (!finding) {
								System.out.println("찾으시는 노래가 재생목록에 없습니다.");
							}
						}
						System.out.println();
					}

					break;
				case 2:
					if (songName.size() == 0) {
						System.out.println("재생목록이 없습니다.");
					} else {
						songName.clear();
						System.out.println("전체 삭제되었습니다.");
					}
					break;
				default:
					System.out.println("잘못입력하셨습니다.");
					break;
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				stop = false;
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}

		}
		sc.close();

	}
}
