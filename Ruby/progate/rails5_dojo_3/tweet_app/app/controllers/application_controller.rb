class ApplicationController < ActionController::Base
  def authenticator
    @current_user = User.find_by(id: session[:user_id])
    if @current_user == nil
      flash[:notice] = "ログインが必要です"
      redirect_to("/login")
    end
  end
  
  def login_user
    @current_user = User.find_by(id: session[:user_id])
    if @current_user != nil
      flash[:notice] = "すでにログインしています"
      redirect_to("/posts/index")
    end
  end

end
