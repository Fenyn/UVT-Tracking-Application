package uvt_tracking_app;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class UVT_Calculator_Tests {

	public static void main(String[] args) {
		UVT_Calculator uvt_Calculator = new UVT_Calculator();
		ArrayList<VideoViewFragment> viewFragmentArrayList = new ArrayList<VideoViewFragment>();

		/*
		// check a single element
		viewFragmentArrayList.add(new VideoViewFragment(0, 10000));
		assertEquals(10000, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Single element - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with no overlap
		viewFragmentArrayList.add(new VideoViewFragment(0, 10000));
		viewFragmentArrayList.add(new VideoViewFragment(20000, 30000));
		viewFragmentArrayList.add(new VideoViewFragment(40000, 50000));
		assertEquals(30000, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with no overlap - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with partial single overlap
		viewFragmentArrayList.add(new VideoViewFragment(0, 10000));
		viewFragmentArrayList.add(new VideoViewFragment(5000, 30000));
		assertEquals(30000, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with partial single overlap - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with full single overlap
		viewFragmentArrayList.add(new VideoViewFragment(0, 10000));
		viewFragmentArrayList.add(new VideoViewFragment(0, 30000));
		assertEquals(30000, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with full single overlap - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with inverted full single overlap
		viewFragmentArrayList.add(new VideoViewFragment(0, 30000));
		viewFragmentArrayList.add(new VideoViewFragment(0, 10000));
		assertEquals(30000, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with inverted full single overlap - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with multiple overlaps
		viewFragmentArrayList.add(new VideoViewFragment(0, 10000));
		viewFragmentArrayList.add(new VideoViewFragment(5000, 15000));
		viewFragmentArrayList.add(new VideoViewFragment(30000, 50000));
		assertEquals(35000, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with multiple overlap - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with large fragment count with no overlaps
		viewFragmentArrayList.add(new VideoViewFragment(0, 20));
		viewFragmentArrayList.add(new VideoViewFragment(30, 40));
		viewFragmentArrayList.add(new VideoViewFragment(50, 60));
		viewFragmentArrayList.add(new VideoViewFragment(70, 80));
		viewFragmentArrayList.add(new VideoViewFragment(90, 100));
		viewFragmentArrayList.add(new VideoViewFragment(110, 120));
		viewFragmentArrayList.add(new VideoViewFragment(130, 140));
		viewFragmentArrayList.add(new VideoViewFragment(150, 160));
		viewFragmentArrayList.add(new VideoViewFragment(170, 180));
		viewFragmentArrayList.add(new VideoViewFragment(190, 200));
		viewFragmentArrayList.add(new VideoViewFragment(210, 220));
		viewFragmentArrayList.add(new VideoViewFragment(230, 240));
		viewFragmentArrayList.add(new VideoViewFragment(250, 260));
		viewFragmentArrayList.add(new VideoViewFragment(270, 280));
		viewFragmentArrayList.add(new VideoViewFragment(290, 300));
		viewFragmentArrayList.add(new VideoViewFragment(310, 320));
		viewFragmentArrayList.add(new VideoViewFragment(330, 340));
		viewFragmentArrayList.add(new VideoViewFragment(350, 360));
		viewFragmentArrayList.add(new VideoViewFragment(370, 380));
		viewFragmentArrayList.add(new VideoViewFragment(390, 400));
		viewFragmentArrayList.add(new VideoViewFragment(410, 420));
		assertEquals(220, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with with large fragment count with no overlaps - clear!");
		viewFragmentArrayList.clear();

		// check multiple elements with large fragment count with overlaps -- unsorted
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(30, 40));
		viewFragmentArrayList.add(new VideoViewFragment(50, 60));
		viewFragmentArrayList.add(new VideoViewFragment(70, 100));
		viewFragmentArrayList.add(new VideoViewFragment(90, 100));
		viewFragmentArrayList.add(new VideoViewFragment(110, 120));
		viewFragmentArrayList.add(new VideoViewFragment(130, 140));
		viewFragmentArrayList.add(new VideoViewFragment(150, 160));
		viewFragmentArrayList.add(new VideoViewFragment(130, 180));
		viewFragmentArrayList.add(new VideoViewFragment(190, 200));
		viewFragmentArrayList.add(new VideoViewFragment(210, 220));
		viewFragmentArrayList.add(new VideoViewFragment(230, 240));
		viewFragmentArrayList.add(new VideoViewFragment(250, 260));
		viewFragmentArrayList.add(new VideoViewFragment(120, 280));
		viewFragmentArrayList.add(new VideoViewFragment(0, 300));
		viewFragmentArrayList.add(new VideoViewFragment(310, 320));
		viewFragmentArrayList.add(new VideoViewFragment(330, 340));
		viewFragmentArrayList.add(new VideoViewFragment(350, 360));
		viewFragmentArrayList.add(new VideoViewFragment(370, 380));
		viewFragmentArrayList.add(new VideoViewFragment(390, 400));
		viewFragmentArrayList.add(new VideoViewFragment(410, 420));
		assertEquals(360, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList));
		System.out.println("Multiple elements with large fragment count with overlaps - clear!");
		viewFragmentArrayList.clear();
		*/
		
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(40, 50));
		viewFragmentArrayList.add(new VideoViewFragment(60, 100));
		assertEquals(45, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 0, 50));
		System.out.println("Single fragment outside end of chapter - pass!");
		viewFragmentArrayList.clear();
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(40, 50));
		viewFragmentArrayList.add(new VideoViewFragment(60, 100));
		assertEquals(50, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 40, 100));
		System.out.println("Single fragment outside beginning of chapter - pass!");
		viewFragmentArrayList.clear();
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(40, 50));
		viewFragmentArrayList.add(new VideoViewFragment(60, 100));
		assertEquals(60, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 25, 100));
		System.out.println("Fragment overlapping start of chapter - pass!");
		viewFragmentArrayList.clear();
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(40, 50));
		viewFragmentArrayList.add(new VideoViewFragment(60, 100));
		assertEquals(60, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 25, 100));
		System.out.println("Multiple fragment overlapping start of chapter - pass!");
		viewFragmentArrayList.clear();
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(40, 50));
		viewFragmentArrayList.add(new VideoViewFragment(60, 100));
		assertEquals(60, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 0, 75));
		System.out.println("Fragment overlapping end of chapter - pass!");
		viewFragmentArrayList.clear();
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 35));
		viewFragmentArrayList.add(new VideoViewFragment(40, 50));
		viewFragmentArrayList.add(new VideoViewFragment(40, 80));
		viewFragmentArrayList.add(new VideoViewFragment(60, 100));
		viewFragmentArrayList.add(new VideoViewFragment(70, 130));
		assertEquals(70, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 0, 75));
		System.out.println("Multiple fragment overlapping end of chapter - pass!");
		viewFragmentArrayList.clear();
		
		viewFragmentArrayList.add(new VideoViewFragment(0, 10));
		viewFragmentArrayList.add(new VideoViewFragment(20, 50));
		viewFragmentArrayList.add(new VideoViewFragment(60, 70));
		assertEquals(20, uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList, 25, 45));
		System.out.println("25 to 45 - pass!");
	}

}
