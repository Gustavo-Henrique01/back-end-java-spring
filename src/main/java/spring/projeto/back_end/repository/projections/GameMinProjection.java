package spring.projeto.back_end.repository.projections;

public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}
