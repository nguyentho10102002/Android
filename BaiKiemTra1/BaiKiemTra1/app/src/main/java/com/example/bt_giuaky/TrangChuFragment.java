package com.example.bt_giuaky;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TrangChuFragment extends Fragment {

    final String mytam="Cô từng xuất hiện trên trang bìa tạp chí Match Du Monde của nước Pháp cùng bài báo Mỹ Tâm – Thế hệ Rock n’ Roll Việt Nam Được trang ABC News (Mỹ) bình chọn là 1 trong 12 Hiện tượng Pop toàn cầu mà bạn chưa biết. Ngay cả fanpage của giải thưởng âm nhạc uy tín thế giới World Music Awards cũng hết lời khen ngợi khi thực hiện liveshow HeartBeat.. Thậm chí, tờ Sports DongA đã dành hẳn một bài viết dài với ta đề Album của Mỹ Tâm và nhà sản xuất âm nhạc Cho Sung Jin lập kỷ lục lọt top 10 Billboard.";
    final String bichphuong="Bích Phương là nữ ca sĩ trẻ mang giọng ca ngọt ngào, sâu lắng của Vbiz. Tham gia showbiz hơn 10 năm, Bích Phương sở hữu hàng loạt hit như Chị ngã em nâng, Bùa yêu, Bao giờ lấy chồng, Chỉ là em giấu đi, Đi Đu Đưa Đi… và nhan sắc cũng ngày càng thăng hạng chưa có điểm dừng. Mới đây nhất, Bích Phương được mời làm đại diện Vpop duy nhất xuất hiện tại lễ trao giải đình đám khu vực AAA 2019. Tại đây, cô đã có màn thể hiện xuất sắc không thua kém các nghệ sĩ nước bạn khiến fan Việt nở mày nở mặt.";
    final String suboi="Suboi là nữ ca sĩ rapper hàng đầu tại Việt Nam, cô có một phong cách rap cực kỳ hiện đại, phóng khoáng và đa dạng. Không chỉ gây được tiếng vang trong nước, Suboi còn được báo chí quốc tế khen ngợi là hiện tượng hip hop Việt.Suboi có không ít lần được báo nước ngoài khen ngợi, đặc biệt là tờ The Wall Street Journal nhận định Suboi có thể trở thành một Queen Latifah của Việt Nam.Không dừng lại ở đó Suboi trở thành sao Việt đầu tiên xuất hiện trên Vogue Nhật, rap tiếng Việt trong ca khúc của diva hàng đầu Nhật Bản. Trình diễn tại lễ hội âm nhạc âm nhạc CAMA và lễ hội âm nhạc điện ảnh thường niên South by Southwest ở Mỹ…";
    final String soobin="Soobin Hoàng Sơn là ca sĩ sớm có điều kiện tiếp xúc với âm nhạc, được đào tạo từ Hàn Quốc và được mệnh danh là Sau hàng loạt những sản phẩm triệu, chục triệu views, Soobin Hoàng Sơn mạnh dạn hợp tác với nữ thần Kpop Jiyeon (em út T-ara) trong MV Đẹp nhất là em. hoàng tử Underground. Anh trở thành một hiện tượng mới và được khán giả Việt lẫn quốc tế ưu ái. Với giọng ca ngọt ngào, truyền cảm được thể hiện trong Phía sau một cô gái, Anh đã quen với cô đơn, Nếu ngày ấy, …";
    final String binz="Binz tên thật Lê Nguyễn Trung Đan. Anh là một nam ca sĩ cũng rất thành công với thể loại nhạc Rap. Với chất giọng hát ngọt ngào, kỹ thuật tốt và luôn biết cách thay đổi phong cách mới mẻ luôn mang lại những sản phẩm âm nhạc độc đáo và lạ lẫm. Tuy không xuất hiện thường xuyên trong các sự kiện quốc tế, nhưng Binz là một trong những cái tên được rất nhiều fan underground quốc tế tìm kiếm.";
    final String noophuocthinh="Thời gian trở lại đây, với kinh nghiệm sân khấu và phong thái chuyên nghiệp nam ca sĩ Noo Phước Thịnh là gương mặt liên tục được lựa chọn để xuất hiện trên các sân khấu Hàn Quốc, Nhật Bản, Hồng Kông và nhận được rất nhiều phản ứng tích cực từ khán giả quốc tế.";
    final String sontung="Sơn Tùng M-TP không ít lần được người hâm mộ cũng như truyền thông quốc tế để ý và bàn luận sôi nổi bởi phong cách thời thượng cùng loạt những sản phẩm âm nhạc có sức ảnh hưởng rộng rãi. Phải đặc biệt nhắc đến màn comeback  gây bão Vpop suốt một thời gian dài với ca khúc kết hợp cùng nam rapper nổi tiếng thế giới Snoop Dogg – Hãy trao cho anh. ";
    final String vucattuong ="Vị trí thứ 6, là sự lộ diện của một trong những ca sĩ kiêm nhạc sĩ đang được yêu mến nhất hiện nay. Vũ Cát Tường không chỉ là tên một ca sĩ, nhạc sĩ, đó là tên của một thương hiệu âm nhạc do chính cô tự tạo ra cho bản thân. Cô còn là nữ ca sĩ Việt Nam đầu tiên, được vinh dự đại diện Việt Nam tham gia Asian Song Festival hai năm liên tiếp 2018 và 2019. ";
    final String dongnhi= "Ở vị trí thứ 8 là một cái tên gắn liền với tuổi teen của thế hệ 8x, 9x bởi những ca khúc làm mưa làm gió một thời như Bối Rối, Ngọt Ngào, Ta Từng Thuộc Về Nhau… Đông Nhi. Khi theo đuổi dòng nhạc mới phù hợp hơn với thị hiếu của công chúng, nữ ca sĩ cũng vẫn  mang về cho mình nhiều thành tích “khủng”. Khiến không chỉ Fan Việt mà cả fan nước bạn cũng phải cháy hết mình cùng cô trong những đêm diễn tại các sự kiện mang tầm quốc tế.";
    final String hongocha= "Hồ Ngọc Hà thuộc số ít những ngôi sao thường xuyên có dịp gặp gỡ các ca sĩ danh tiếng quốc tế. Thay vì bị lép vế khi chạm trán sao quốc tế, nữ ca sĩ luôn gây ấn tượng mạnh mẽ với vẻ ngoài rạng rỡ, thần thái cuốn hút luôn khiến không chỉ fan Việt mà khán giả nước ngoài cũng phải trầm trồ.";

    ListView lvCaSi;
    List<list_Ca_Si> arrayCaSi;
    CaSiAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_trang_chu_fragment,container,false);
        lvCaSi = (ListView) view.findViewById(R.id.listviewCaSi);
        Danhsach();
        adapter = new CaSiAdapter(getContext(), R.layout.dong_ca_si, arrayCaSi);
        lvCaSi.setAdapter(adapter);
        lvCaSi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), MainActivity_Mo_ta_ca_si.class);
                intent.putExtra("key1", arrayCaSi.get(i).getTen());
                intent.putExtra("key2", arrayCaSi.get(i).getMoTaChiTiet());
                intent.putExtra("key3", arrayCaSi.get(i).getHinh());
                intent.putExtra("key4", arrayCaSi.get(i).getQuocGia());
                intent.putExtra("key5", arrayCaSi.get(i).getSaoBinhChon());
                intent.putExtra("key6", arrayCaSi.get(i).getAnhChiTiet());
                startActivity(intent);
            }
        });
        return view;
//
    }

    private void Danhsach() {
        arrayCaSi = new ArrayList<>();
        arrayCaSi.add(new list_Ca_Si("Phan Thị Mỹ Tâm", "Nữ hoàng của Vpop", R.drawable.mytam,"Việt Nam","5 Sao",mytam,R.drawable.mytam));
        arrayCaSi.add(new list_Ca_Si("Bùi Thị Bích Phuong", "Thánh nữ nhạc sầu", R.drawable.bichphuong,"Việt Nam","5 Sao",bichphuong,R.drawable.bichphuong));
        arrayCaSi.add(new list_Ca_Si("Hàng Lâm Trang Anh", "Nữ hoàng nhạc hip-hop", R.drawable.suboi,"Việt Nam","5 Sao",suboi,R.drawable.suboi));
        arrayCaSi.add(new list_Ca_Si("Nguyễn Huỳnh Sơn", "Hoàng tử Underground", R.drawable.soobinhoangson,"Việt Nam","5 Sao",soobin,R.drawable.soobinhoangson));
        arrayCaSi.add(new list_Ca_Si("Lê Nguyễn Trung Đan", "Binz Da Poet", R.drawable.binz,"Việt Nam","5 Sao",binz,R.drawable.binz));
        arrayCaSi.add(new list_Ca_Si("Nguyễn Phước Thịnh", "Hoàng tử Ballad", R.drawable.noophuocthinh,"Việt Nam","5 Sao",noophuocthinh,R.drawable.noophuocthinh));
        arrayCaSi.add(new list_Ca_Si("Nguyễn Thanh Tùng", "Sơn Tùng M-TP", R.drawable.stung,"Việt Nam","5 Sao",sontung,R.drawable.stung));
        arrayCaSi.add(new list_Ca_Si("Vũ Cát Tường", "Vũ Cát Tường", R.drawable.vucattuong,"Việt Nam","5 Sao",vucattuong,R.drawable.vucattuong));
        arrayCaSi.add(new list_Ca_Si("Mai Hồng Ngọc", "Đông Nhi", R.drawable.dongnhi,"Việt Nam","5 Sao",dongnhi,R.drawable.dongnhi));
        arrayCaSi.add(new list_Ca_Si("Hồ Ngọc Hà", "Nữ hoàng giới giải trí", R.drawable.hongocha,"Việt Nam","5 Sao",hongocha,R.drawable.hongocha));


    }

}