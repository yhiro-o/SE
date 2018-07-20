package forest;

import java.awt.Component;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * 樹状整列におけるノード（節）を担うクラスになります。
 */
public class Node extends Component
{
	/**
	 * ノード名：ラベル文字列を記憶するフィールドです。
	 */
	private String name;
	
	/**
	 * ノードの場所（位置：座標）を記憶するフィールドです。
	 */
	private Point location;
	
	/**
	 * ノードの大きさ（幅と高さ）を記憶するフィールドです。
	 */
	private Point extent;
	
	/**
	 * 樹状整列する際のノードの状態を記憶するフィールドです。
	 */
	private Integer status;
	
	/**
	 * このクラスのインスタンスを生成するコンストラクタです。
	 * @param aString ノード名：ラベル文字列
	 */
	public Node(String aString)
	{
		return;
	}
	
	/**
	 * ノード（節）を描画するメソッドです。
	 * @param aGraphics グラフィクス（描画コンテクスト）
	 */
	public void draw(Graphics aGraphics)
	{
		return;
	}
	
	/**
	 * ノード（節）の描画領域を応答するメソッドです。
	 * @return ノード（節）の描画領域（Rectangleのインスタンス）
	 */
	public Rectangle getBounds()
	{
		return;
	}
	
	/**
	 * ノード（節）の大きさを応答するメソッドです。
	 * @return ノード（節）の大きさ（幅と高さ）
	 */
	public Point getExtent()
	{
		return extent;
	}
	
	/**
	 * ノード（節）の位置を応答するメソッドです。
	 * @return ノード（節）の位置（座標）
	 */
	public Point getLocation()
	{
		return location;
	}
	
	/**
	 * ノード（節）の名前を応答するメソッドです。
	 * @return ノード名（ラベル文字列）
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * ノード（節）の状態を応答するメソッドです。
	 * @return ノードの状態
	 */
	public Integer getStatus()
	{
		return status;
	}
	
	/**
	 * ノード（節）の大きさを設定するメソッドです。
	 * @param aPoint ノードの大きさ（幅と高さ）
	 */
	public void setExtent(Point aPoint)
	{
		extent = aPoint;
		return;
	}
	
	/**
	 * ノード（節）の位置を設定するメソッドです。
	 * @param aPoint ノードの位置（座標）
	 */
	public void setLocation(Point aPoint)
	{
		location = aPoint;
		return;
	}
	
	/**
	 * ノード（節）の名前を設定するメソッドです。
	 * @param aString ノードの名前（ラベル）
	 */
	public void setName(String aString)
	{
		name = aString;
		return;
	}
	
	/**
	 * ノード（節）の状態を設定するメソッドです。
	 * @param anInteger ノードの状態
	 */
	public void setStatus(Integer anInteger)
	{
		status = anInteger;
		return;
	}
	
	/**
	 * 文字列の高さを応答するメソッドです。
	 * @param string 文字列
	 * @return 文字列の高さ
	 */
	protected int stringHeight(String string)
	{
		return;
	}
	
	/**
	 * 文字列の幅を応答するメソッドです。
	 * @param string 文字列
	 * @return 文字列の幅
	 */
	protected int stringWidth(String string)
	{
		return;
	}
	
	/**
	 * 自分自身を文字列に変換するメソッドです。
	 * @return 自分自身を表す文字列
	 */
	public String toString()
	{
		return;
	}

}