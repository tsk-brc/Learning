require './app/mission_d_173.rb'

describe '文字列入れ替えチェック' do
  describe '出力結果のテスト' do
    let(:missionD173) { MissionD173.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "one two\n" }
      expect($stdout).to receive(:puts).with('two one')
      missionD173.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "a b\n" }
      expect($stdout).to receive(:puts).with('b a')
      missionD173.run
    end
  end
end
